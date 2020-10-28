package com.wwy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MyConfig.class)//导入合并其他配置类，类似于配置文件中的 inculde 标签
public class MyConfig2 {
}
