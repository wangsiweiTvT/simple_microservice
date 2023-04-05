
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.builder.GeneratorBuilder;
import com.baomidou.mybatisplus.generator.config.querys.MySqlQuery;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

/**
 * @Auther: wangsiwei
 * @Date: 2020/9/11 11:52
 * @Description:
 */
public class WswMybatisPlusGenerator {
    private static final String REPLACE_LOCAL_PATH = "target/test-classes/";
    private static final String JAVA_PATH = "src/main/java";
    /**
     * <p>
     * 读取控制台内容
     * </p>
     */
    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.isNotEmpty(ipt)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }

    public static void main(String[] args) {
        // 获取项目路径
        String projectPath = ClassLoader.getSystemResource("").getPath().replace(REPLACE_LOCAL_PATH, "");
        // 全局配置
        GlobalConfig gc = GeneratorBuilder.globalConfigBuilder()
                .fileOverride().openDir(false)
                .outputDir(projectPath + JAVA_PATH)
                .author("wsw")
                .enableSwagger()
                .commentDate("yyyy-MM-dd").build();

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig.Builder("jdbc:mysql://127.0.0.1:3306/xingluo_xingshi?useUnicode=true&useSSL=false&characterEncoding=utf8", "root", "wsw2852006")
                .dbQuery(new MySqlQuery()).build();
        // 包配置
        PackageConfig pc = GeneratorBuilder.packageConfigBuilder().parent("com.wsw").build();

        // 策略配置
        StrategyConfig strategy = GeneratorBuilder.strategyConfigBuilder()
                .addInclude(scanner("表名"))
                .addTablePrefix(pc.getModuleName() + "_")
                .controllerBuilder().enableHyphenStyle()
                .entityBuilder()
                .naming(NamingStrategy.underline_to_camel)
                .columnNaming(NamingStrategy.underline_to_camel)
//                .versionColumnName("version").logicDeleteColumnName("isDelete")
                .enableLombok()
                .build();

        TemplateConfig templateConfig = GeneratorBuilder.templateConfigBuilder().build();

        // 代码生成器
        AutoGenerator mpg = new AutoGenerator(dsc).global(gc).strategy(strategy).template(templateConfig).packageInfo(pc);

        mpg.execute(new FreemarkerTemplateEngine());
    }

}
