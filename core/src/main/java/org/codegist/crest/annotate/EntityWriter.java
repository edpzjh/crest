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

package org.codegist.crest.annotate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>Binds a entity writer for the annotated method entity, overriding the HTTP entity writing behavior.</p>
 * <p>Default behavior will handle POST/PUT entities as application/x-www-form-urlencoded and MultiPart request as multipart/form-data encoded</p>
 * <p>When set at interface level, it will applies to all methods where it is not already specified</p>
 * @author Laurent Gilles (laurent.gilles@codegist.org)
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.ANNOTATION_TYPE})
public @interface EntityWriter {

    /**
     * Binds a entity writer for the annotated method entity
     */
    Class<? extends org.codegist.crest.entity.EntityWriter> value();
    
}
