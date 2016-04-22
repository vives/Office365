/*
 *  Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */

package org.wso2.carbon.identity.authenticator.office365;

public class Office365AuthenticatorConstants {
    public static final String AUTHENTICATOR_NAME = "Office365Authenticator";
    public static final String AUTHENTICATOR_FRIENDLY_NAME = "Office365";
    //office365 authorize endpoint URL
    public static final String office365_OAUTH_ENDPOINT = "https://login.microsoftonline.com/common/oauth2/authorize";
    //office365 token  endpoint URL
    public static final String office365_TOKEN_ENDPOINT = "https://login.microsoftonline.com/common/oauth2/token";
    //office365 user info endpoint URL
    public static final String office365_USERINFO_ENDPOINT = "https://outlook.office.com/api/v2.0/me";
    public static final String Resource = "resource";
    public static final String CLIENT_ID = "client_id";
    public static final String REDIRECT_URI = "callbackUrl";
    public static final String ID="Id";
}