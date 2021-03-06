/**
 * Copyright Dingxuan. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.bcia.julongchain.csp.gm.dxct;

import org.bcia.julongchain.csp.intfs.opts.IRngOpts;

/**
 * 随机数选项
 *
 * @author sunianle
 * @date 3/27/18
 * @company Dingxuan
 */
public class RngOpts implements IRngOpts {
    @Override
    public String getAlgorithm() {
        return "RANDOM";
    }
}
