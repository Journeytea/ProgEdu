package fcu.selab.progedu.service;

import java.io.File;
import java.io.IOException;

import fcu.selab.progedu.status.Status;
import fcu.selab.progedu.utils.ZipHandler;

public interface AssignmentTypeSelector {

  public String getSampleZip();

  public void unzip(String zipFilePath, String zipFolderName, String projectName,
      ZipHandler zipHandler) throws IOException;

  public void searchFile(String entryNewName);

  public void copyTestFile(File folder, String strFolder, String testFilePath);

  public void createJenkinsJob(String name, String jenkinsRootUsername, String jenkinsRootPassword)
      throws Exception;

  public String getJenkinsConfig();

  public void modifyXmlFile(String filePath, String updateDbUrl, String userName, String proName,
      String tomcatUrl, StringBuilder sb);
  
  public Status getStatus(String statusType);

}
