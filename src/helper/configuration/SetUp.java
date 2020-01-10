package helper.configuration;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import helper.jarLoader.Loader;
import helper.propertiesLoader.PropertiesLoader;

public class SetUp {

  /**
   * Task to configure project path.
   * 
   * @param args
   * @throws IOException
   */
  public static void main(String[] args) throws IOException {

    try {
      Loader.Cargar(PropertiesLoader.getProperty("projectPath") + "/lib");
    } catch (IOException e) {
      e.printStackTrace();
    }

    InputStream in = SetUp.class.getResourceAsStream("/setUp.properties");

    String confFilePath = SetUp.class.getClassLoader().getResource("setUp.properties").getPath();
    String newPath = confFilePath.replaceAll("bin", "src");
    FileOutputStream out = new FileOutputStream(newPath);

    Properties properties = new Properties();
    properties.load(in);

    in.close();

    String workingDir = System.getProperty("user.dir");

    properties.setProperty("projectPath", workingDir);
    properties.store(out, null);

    out.close();


    System.out.println("Project path set on: " + workingDir);

  }

}
