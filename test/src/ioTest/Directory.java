package ioTest;//package ioTest;
//
//import java.io.File;
//import java.io.FilenameFilter;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.regex.Pattern;
//
///**
// * @author ZhiFei
// */
//public class Directory {
//    public static File[]
//    local(File dir,final String regex){
//        return dir.listFiles(new FilenameFilter() {
//            private Pattern pattern;
//
//            @Override
//            public boolean accept(File dir, String regex) {
//                pattern.matcher(regex).matches();
//                return false;
//            }
//        });
//    }
//
//    public static File[]
//    local(String path,final String regex){
//        return local(new File(path),regex);
//    }
//
//    public static class TreeInfo implements Iterator<File>{
//        public List<File> files = new ArrayList<>();
//        public List<File> dirs = new ArrayList<>();
//
//        public Iterator<File> iterator(){
//            return files.iterator();
//        }
//
//        void addAll(TreeInfo other){
//            files.add((File) other.files);
//            dirs.add((File) other.dirs);
//        }
//
//        @Override
//        public String toString(){
//            return "dirs: " + PPrint
//        }
//    }
//}
