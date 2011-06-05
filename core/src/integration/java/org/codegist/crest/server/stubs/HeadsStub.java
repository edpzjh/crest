/*
 * Copyright 2010 CodeGist.org
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

package org.codegist.crest.server.stubs;

import javax.ws.rs.*;
import javax.ws.rs.core.Cookie;
import java.util.Arrays;
import java.util.List;

@Produces("text/html;charset=UTF-8")
@Path("resource/head")
public class HeadsStub {

    private String lastCall;

    @GET
    public String lastCall(){
        return lastCall;
    }
    
    @HEAD
    public void head(){
        lastCall = "head";
    }

    @HEAD
    @Path("query")
    public void headQuery(
                @QueryParam("q1") String q1,
                @QueryParam("q2") String q2,
                @QueryParam("q3") Float[] q3){
        lastCall = String.format("headQuery q1=%s q2=%s q3=%s", q1, q2, Arrays.toString(q3));
    }

    @HEAD
    @Path("matrix")
    public void headMatrix(
                @MatrixParam("m1") String m1,
                @MatrixParam("m2") String m2,
                @MatrixParam("m3") Float[] m3){
        lastCall =  String.format("headMatrix m1=%s m2=%s m3=%s", m1, m2, Arrays.toString(m3));
    }

    @HEAD
    @Path("path/{p1}/{p2:\\d{4}}/{p3}")
    public void headPath(
                @PathParam("p1") String p1,
                @PathParam("p2") String p2,
                @PathParam("p3") String p3){
        lastCall =  String.format("headPath p1=%s p2=%s p3=%s", p1, p2, p3);
    }

    @HEAD
    @Path("header")
    public void headHeader(
                @HeaderParam("h1") String h1,
                @HeaderParam("h2") String h2,
                @HeaderParam("h3") Float[] h3){    
        lastCall =  String.format("headHeader h1=%s h2=%s h3=%s", h1, h2, Arrays.toString(h3));
    }

    @HEAD
    @Path("cookie")
    public void headCookie(
                @HeaderParam("Cookie") List<Cookie> cookies,
                @CookieParam("c1") String c1,
                @CookieParam("c2") String c2,
                @CookieParam("c3") String c3) {
        lastCall =  String.format("headCookie(header:%s) c1=%s c2=%s c3=%s" , cookies, c1, c2, c3);
    }



}