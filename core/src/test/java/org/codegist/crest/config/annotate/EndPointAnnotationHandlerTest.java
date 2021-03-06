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

package org.codegist.crest.config.annotate;

import org.codegist.crest.annotate.EndPoint;
import org.junit.Test;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author Laurent Gilles (laurent.gilles@codegist.org)
 */
public class EndPointAnnotationHandlerTest extends DownToMethodAnnotationBaseTest<EndPoint> {

    private final EndPointAnnotationHandler toTest = new EndPointAnnotationHandler(crestConfig);

    public EndPointAnnotationHandlerTest() {
        super(EndPoint.class);
    }

    @Test
    public void handleInterfaceAnnotationShouldSetMethodsEndPoint() throws Exception {
        when(mockAnnotation.value()).thenReturn("a");
        toTest.handleInterfaceAnnotation(mockAnnotation, mockInterfaceConfigBuilder);
        verify(mockAnnotation).value();
        verify(mockInterfaceConfigBuilder).setMethodsEndPoint("a");
    }

    @Test
    public void handleInterfaceAnnotationShouldMergePlaceholdersAndSetMethodsEndPoint() throws Exception {
        when(mockAnnotation.value()).thenReturn(VAL_WITH_PH);
        toTest.handleInterfaceAnnotation(mockAnnotation, mockInterfaceConfigBuilder);
        verify(mockAnnotation).value();
        verify(mockInterfaceConfigBuilder).setMethodsEndPoint(EXPECTED_MERGE_VAL);
    }

    @Test
    public void handleMethodsAnnotationShouldSetEndPoint() throws Exception {
        when(mockAnnotation.value()).thenReturn("a");
        toTest.handleMethodAnnotation(mockAnnotation, mockMethodConfigBuilder);
        verify(mockAnnotation).value();
        verify(mockMethodConfigBuilder).setEndPoint("a");
    }

    @Test
    public void handleMethodsAnnotationShouldMergePlaceholdersAndSetEndPoint() throws Exception {
        when(mockAnnotation.value()).thenReturn(VAL_WITH_PH);
        toTest.handleMethodAnnotation(mockAnnotation, mockMethodConfigBuilder);
        verify(mockAnnotation).value();
        verify(mockMethodConfigBuilder).setEndPoint(EXPECTED_MERGE_VAL);
    }

    @Override
    public AnnotationHandler<EndPoint> getToTest() {
        return toTest;
    }
}
