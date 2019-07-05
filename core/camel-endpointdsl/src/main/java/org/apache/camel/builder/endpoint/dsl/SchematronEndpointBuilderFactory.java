/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Validates the payload of a message using the Schematron Library.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SchematronEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Schematron component.
     */
    public interface SchematronEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedSchematronEndpointBuilder advanced() {
            return (AdvancedSchematronEndpointBuilder) this;
        }
        /**
         * Flag to abort the route and throw a schematron validation exception.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default SchematronEndpointBuilder abort(boolean abort) {
            setProperty("abort", abort);
            return this;
        }
        /**
         * Flag to abort the route and throw a schematron validation exception.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default SchematronEndpointBuilder abort(String abort) {
            setProperty("abort", abort);
            return this;
        }
        /**
         * To use the given schematron rules instead of loading from the path.
         * 
         * The option is a: <code>javax.xml.transform.Templates</code> type.
         * 
         * Group: producer
         */
        default SchematronEndpointBuilder rules(Object rules) {
            setProperty("rules", rules);
            return this;
        }
        /**
         * To use the given schematron rules instead of loading from the path.
         * 
         * The option will be converted to a
         * <code>javax.xml.transform.Templates</code> type.
         * 
         * Group: producer
         */
        default SchematronEndpointBuilder rules(String rules) {
            setProperty("rules", rules);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Schematron component.
     */
    public interface AdvancedSchematronEndpointBuilder
            extends
                EndpointProducerBuilder {
        default SchematronEndpointBuilder basic() {
            return (SchematronEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSchematronEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSchematronEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSchematronEndpointBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSchematronEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Set the URIResolver to be used for resolving schematron includes in
         * the rules file.
         * 
         * The option is a: <code>javax.xml.transform.URIResolver</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSchematronEndpointBuilder uriResolver(Object uriResolver) {
            setProperty("uriResolver", uriResolver);
            return this;
        }
        /**
         * Set the URIResolver to be used for resolving schematron includes in
         * the rules file.
         * 
         * The option will be converted to a
         * <code>javax.xml.transform.URIResolver</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSchematronEndpointBuilder uriResolver(String uriResolver) {
            setProperty("uriResolver", uriResolver);
            return this;
        }
    }
    /**
     * Schematron (camel-schematron)
     * Validates the payload of a message using the Schematron Library.
     * 
     * Syntax: <code>schematron:path</code>
     * Category: validation
     * Available as of version: 2.15
     * Maven coordinates: org.apache.camel:camel-schematron
     */
    default SchematronEndpointBuilder schematron(String path) {
        class SchematronEndpointBuilderImpl extends AbstractEndpointBuilder implements SchematronEndpointBuilder, AdvancedSchematronEndpointBuilder {
            public SchematronEndpointBuilderImpl(String path) {
                super("schematron", path);
            }
        }
        return new SchematronEndpointBuilderImpl(path);
    }
}