import java.io.File;
import java.text.NumberFormat;

public class FilesPathReader {
	File file;
	File[] roots;
	String  drive;
	double  size;
	
	public void readerRun() {
		FilesPathReader path = new FilesPathReader();
		roots = File.listRoots();
		NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2); 
		
		/*
		for (File root : roots) {
            drive = root.getPath();
            size = root.getTotalSpace() / Math.pow(1024, 3);
            System.out.print("Drive : " + drive);
            System.out.println("                     - Space : " + nf.format(size) + " GB");   
        }
		
		
		for (File root : roots) {
			drive = root.getPath();
			file = new File(drive);
			File []rootFileList = file.listFiles();
			if(rootFileList==null) continue;
			for(File tempFile:rootFileList) {
				size = tempFile.length() / Math.pow(1024, 1);
				System.out.print(tempFile.getName());
				System.out.println("                     - Space : " + nf.format(size) + " KB");
			}
		}*/
		//return path; 
        
        for (File root : roots) {
			drive = root.getPath();
			//showFileList(drive.to);
		}
	}
	
	public void showFileList(String path) throws Exception {
        File dir = new File(path);
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            if (file.isFile()) {
                System.out.println("[File]"+file.getCanonicalPath().toString());
            } else if (file.isDirectory()) {
                System.out.println("[Directory]"+file.getCanonicalPath().toString());
                try {
                    showFileList(file.getCanonicalPath().toString());
                } catch (Exception e) {
                }
            }
        }
    }

}
