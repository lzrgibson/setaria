/**
 * Copyright (C) 2016 The Weghst Inc. <kevinz@weghst.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.weghst.setaria.client;

import org.testng.annotations.Test;

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
public class JsonSetariaConfigTest {

    @Test
    public void testInit() throws Exception {
        SetariaBean setariaBean = new SetariaBean();
        setariaBean.addResource("classpath:com/weghst/setaria/client/test-config-1.json");
        setariaBean.addResource("classpath:com/weghst/setaria/client/test-config-2.json");
        setariaBean.addResource("classpath:com/weghst/setaria/client/test-config-3.json", true);

        JsonSetariaConfig setariaConfig = new JsonSetariaConfig(setariaBean);
        setariaConfig.init();
    }

    @Test
    public void testRefresh() throws Exception {
    }

}