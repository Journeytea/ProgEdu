package fcu.selab.progedu.status;

public class WebCheckstyleFailure implements Status {

  @Override
  public String extractFailureMsg(String consoleText) {
    String checkstyleInfo = "WebCheckstyleFailure";
    String checkstyleStart = "> eslint -c ./src/test/.eslintrc.js ./ & htmlhint ./";
    String checkstyleEnd = "Scanned";
    
    checkstyleInfo = consoleText.substring(consoleText.indexOf(checkstyleStart) 
        + checkstyleStart.length() + 1, consoleText.lastIndexOf(checkstyleEnd) - 1);
    return checkstyleInfo.trim();
  }
}
