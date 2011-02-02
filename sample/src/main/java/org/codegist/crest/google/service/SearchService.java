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

package org.codegist.crest.google.service;

import org.codegist.crest.annotate.*;
import org.codegist.crest.google.domain.Address;
import org.codegist.crest.google.domain.SearchResult;
import org.codegist.crest.google.handler.GoogleResponseHandler;

/**
 * @author Laurent Gilles (laurent.gilles@codegist.org)
 */
@EndPoint("http://ajax.googleapis.com")
@ContextPath("/ajax/services/search")
@QueryParam(name = "v", value = "1.0")
@ResponseHandler(GoogleResponseHandler.class)
public interface SearchService {

    @Path("/web")
    SearchResult<Address> search(@QueryParam(name = "q") String text);

}

