package helper.jarLoader;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class Loader {

  public static URLClassLoader cargadorJVM = (URLClassLoader) ClassLoader.getSystemClassLoader();


  public static void Cargar(String libFolder) throws IOException {
    Class<URLClassLoader> claseJVM = URLClassLoader.class;
    Class<?>[] params = new Class[] {URL.class};
    File files[] = null;

    try {
      File objFile = new File(libFolder);
      Method metodo = claseJVM.getDeclaredMethod("addURL", params);
      // esta linea es para volver accesible el m�todo
      metodo.setAccessible(true);

      files = objFile.listFiles();
      System.out.println("PATH: " + objFile.getAbsolutePath().toString());
      for (int i = 0; i < files.length; i++) {

        if (files[i].getName().endsWith(".jar")) {
          URL objUrl = files[i].toURI().toURL();
          metodo.invoke(cargadorJVM, new Object[] {objUrl});
          System.out.print("Cargando jar: " + objUrl.toString() + "\n");
        }

      }

    } catch (Throwable th) {

      // th.printStackTrace();
      // System.out.print(files.length);
      throw new IOException("Error al cargar librerias", th);
    }
  }
}
