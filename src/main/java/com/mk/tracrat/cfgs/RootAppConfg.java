package com.mk.tracrat.cfgs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value={PersistanceConfg.class,Service.class})
public class RootAppConfg {

}
