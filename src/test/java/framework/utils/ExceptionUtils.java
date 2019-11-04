package framework.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionUtils {

    public static void printStackTraceToConsole(Throwable exceptionThrownByTest) {
        if(exceptionThrownByTest!=null){
            System.out.println(exceptionThrownByTest.getMessage());
            StringWriter sw = new StringWriter();
            exceptionThrownByTest.printStackTrace(new PrintWriter(sw));
            System.out.println(sw.toString());
        }
    }

}
