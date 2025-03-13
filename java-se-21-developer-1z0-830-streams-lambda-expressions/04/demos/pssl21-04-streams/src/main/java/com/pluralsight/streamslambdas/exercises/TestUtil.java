package com.pluralsight.streamslambdas.exercises;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestUtil {

    public static String captureSystemOut(Runnable runnable) {
        PrintStream backup = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer));

        try {
            runnable.run();
        } finally {
            System.out.flush();
            System.setOut(backup);
        }

        return buffer.toString();
    }
}
