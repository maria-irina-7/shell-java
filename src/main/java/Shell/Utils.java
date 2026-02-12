package Shell;

import java.io.File;

public class Utils {
    public static String getExternalCommand(String name) {
        String allOutsideCommands = System.getenv("PATH");
        String[] pathCommands = allOutsideCommands.split(File.pathSeparator);

        for(int i = 0; i < pathCommands.length; i++) {
            File file = new File(pathCommands[i], name);
            if(file.exists() && file.canExecute()) {
                return file.getAbsolutePath();
            }
        }
        return null;
    }

}
