package framework.listeners;

import framework.utils.ExceptionUtils;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestLogger extends TestListenerAdapter {

    @Override
    public void onTestFailure(ITestResult tr) {
        log(tr, "--Test method failed--\n\n");
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        log(tr, "--Test method skipped--\n\n");
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        log(tr, "--Test method success--\n\n");
    }

    private void appendHierarchicalPathInfoIfApplicable(ITestResult tr, StringBuilder testData) {
        String testClassInstancePhysicalAddress = tr.getInstance().toString();
        testData.append(")").append("\nMemory address :: ").append(testClassInstancePhysicalAddress).append("\n");
    }

    private void appendMethodParameterInfo(ITestResult tr, StringBuilder testData) {
        int i=0;
        Object[] parameters = tr.getParameters();
        if(parameters==null)
            return;
        for(Object parameter: parameters){
            if(i++==0) {
                testData.append(parameter);
            } else {
                testData.append(", ").append(parameter);
            }
        }
    }

    private void logExceptionInfo(ITestResult tr) {
        Throwable exceptionThrownByTest = tr.getThrowable();
        ExceptionUtils.printStackTraceToConsole(exceptionThrownByTest);
    }

    private void log(ITestResult tr, String status) {
        StringBuilder testData = new StringBuilder(tr.getTestClass().getName());
        appendHierarchicalPathInfoIfApplicable(tr, testData);
        testData.append(".").append(tr.getName()).append("(");
        appendMethodParameterInfo(tr, testData);
        System.out.println(testData.append(")").toString());
        logExceptionInfo(tr);
        System.out.println(status);
    }
}