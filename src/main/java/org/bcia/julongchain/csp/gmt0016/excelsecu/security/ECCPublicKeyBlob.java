/**
 * Copyright BCIA. All Rights Reserved.
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
package org.bcia.julongchain.csp.gmt0016.excelsecu.security;


/**
 * GM0016 ECC 公钥数据类
 *
 * @author chenhao
 * @date 2018/4/2
 * @company Excelsecu
 */
public class ECCPublicKeyBlob {
    private byte[] xCoordinate;
    private byte[] yCoordinate;

    public ECCPublicKeyBlob() {

    }

    public ECCPublicKeyBlob(byte[] xCoordinate, byte[] yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public byte[] getxCoordinate() {
        return xCoordinate;
    }

    public byte[] getyCoordinate() {
        return yCoordinate;
    }

    public void setxCoordinate(byte[] xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setyCoordinate(byte[] yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

}
