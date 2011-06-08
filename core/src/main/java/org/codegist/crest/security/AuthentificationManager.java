/*
 * Copyright 2010 CodeGist.org
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 * ===================================================================
 *
 * More information at http://www.codegist.org.
 */

package org.codegist.crest.security;

import org.codegist.crest.http.HttpParam;
import org.codegist.crest.http.HttpRequest;

/**
 * AuthentificationManager interface
 * @author Laurent Gilles (laurent.gilles@codegist.org)
 */
public interface AuthentificationManager {

    /**
     * Sign the request
     * @param request request to be signed
     * @param properties optional signing properties
     */
    void sign(HttpRequest.Builder request, HttpParam... properties);

    /**
     * Refresh the authentification information
     */
    void refresh();

}
