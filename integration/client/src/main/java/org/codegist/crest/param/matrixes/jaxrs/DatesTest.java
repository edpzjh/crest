/*
 * Copyright 2011 CodeGist.org
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 *  ===================================================================
 *
 *  More information at http://www.codegist.org.
 */

package org.codegist.crest.param.matrixes.jaxrs;

import org.codegist.crest.annotate.EndPoint;
import org.codegist.crest.param.matrixes.common.IDatesTest;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import java.util.Date;

/**
 * @author laurent.gilles@codegist.org
 */
public class DatesTest extends IDatesTest<DatesTest.Dates> {

    public DatesTest(CRestHolder crest) {
        super(crest, Dates.class);
    }

    @EndPoint("{crest.server.end-point}")
    @Path("params/matrix/date")
    public static interface Dates extends IDatesTest.IDates {

        @GET
        String date(
                @MatrixParam("p1") Date p1,
                @MatrixParam("p2") Date... p2);

    }
}
