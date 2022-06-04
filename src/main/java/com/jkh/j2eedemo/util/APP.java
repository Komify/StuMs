package com.jkh.j2eedemo.util;

import org.mybatis.generator.api.ShellRunner;

public class APP {


        //该配置文件放在src\\main\\resources\\该路径下即可
        public static void main(String[] args) {
            args = new String[] { "-configfile", "src\\main\\resources\\mp.xml", "-overwrite" };
            ShellRunner.main(args);
        }

}
