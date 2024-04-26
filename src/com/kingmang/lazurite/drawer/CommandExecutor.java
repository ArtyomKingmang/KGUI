package com.kingmang.lazurite.drawer;

import com.kingmang.lazurite.display.Window;

import java.lang.reflect.Method;

import static com.kingmang.lazurite.Main.mySketch;

public class CommandExecutor {


    public static void executeCommand(String command) {
        try {
            String[] functionCalls = command.split(";");
            for (String call : functionCalls) {
                String[] parts = call.split("\\(");
                String methodName = parts[0];
                String[] params = parts[1].replaceAll("\\)", "").split(",");

                Class<?>[] paramTypes = new Class[params.length];
                Object[] paramValues = new Object[params.length];

                for (int i = 0; i < params.length; i++) {
                    paramTypes[i] = int.class;
                    paramValues[i] = Integer.parseInt(params[i]);
                }

                Method method = Window.class.getDeclaredMethod(methodName, paramTypes);
                method.invoke(mySketch, paramValues);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}