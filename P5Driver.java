import java.util.ArrayList;

class P5Driver {
    public static void main(String[] args) {
        Folder f1 = new Folder("php_demo1");

        Folder f2 = new Folder("Source Files");

        Folder f3 = new Folder(".phalcon");
        Folder f4 = new Folder("app");

        Folder f5 = new Folder("config");
        Folder f6 = new Folder("controllers");
        Folder f7 = new Folder("library");
        Folder f8 = new Folder("migrations");
        Folder f9 = new Folder("models");
        Folder f10 = new Folder("views");

        f4.insertFolder(f5);
        f4.insertFolder(f6);
        f4.insertFolder(f7);
        f4.insertFolder(f8);
        f4.insertFolder(f9);
        f4.insertFolder(f10);

        Folder f11 = new Folder("cache");
        Folder f12 = new Folder("public");

        File f13 = new File(".htaccess");
        File f14 = new File(".htrouter.php");
        File f15 = new File("index.html");

        f2.insertFolder(f3);
        f2.insertFolder(f4);
        f2.insertFolder(f11);
        f2.insertFolder(f12);
        f2.insertFile(f13);
        f2.insertFile(f14);
        f2.insertFile(f15);

        f1.insertFolder(f2);
        
        Folder f16 = new Folder("Include Path");
        Folder f17 = new Folder("Remote Files");

        f1.insertFolder(f16);
        f1.insertFolder(f17);

        f1.print(0);

        System.out.println("------------------------------------------");
        System.out.println("Deleting folder: app");
        System.out.println("------------------------------------------");

        f1.deleteFolder("app");
        f1.print(0);

        System.out.println("------------------------------------------");
        System.out.println("Deleting folder: public");
        System.out.println("------------------------------------------");

        f1.deleteFolder("public");
        f1.print(0);
    }
}