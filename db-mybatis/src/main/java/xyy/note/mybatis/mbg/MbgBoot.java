package xyy.note.mybatis.mbg;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xyy
 * @version 1.0 2017/3/10.
 * @since 1.0
 */
public class MbgBoot {
    public static void main(String[] args) throws InvalidConfigurationException, InterruptedException, SQLException, IOException, XMLParserException {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("/Users/xyy/IdeaProjects/java-note/db-mybatis/src/main/resources/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        warnings.stream().forEach(e->{
            System.out.println(e);
        });
    }
}
