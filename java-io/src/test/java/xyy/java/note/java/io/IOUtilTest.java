package xyy.java.note.java.io;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

/**
 * @author xyy
 * @version 1.0 2017/4/11.
 * @since 1.0
 */
public class IOUtilTest {
    @Test
    public void printHex() throws Exception {
        IOUtil.printHex("/Users/xyy/IdeaProjects/java-note/java-io/src/test/resources/raf");
    }


    @Test
    public void printHexByByteArray() throws Exception {
        IOUtil.printHexByByteArray("/Users/xyy/IdeaProjects/java-note/java-io/src/test/resources/raf");
    }

    @Test
    public void copyFile() throws Exception {
        IOUtil.copyFile(new File("/Users/xyy/IdeaProjects/java-note/README.md"), new File("/Users/xyy/IdeaProjects/java-note/README2.md"));
    }



}