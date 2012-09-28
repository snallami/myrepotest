/*******************************************************************************
 * Copyright (c) 2012 GigaSpaces Technologies Ltd. All rights reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

@javax.xml.bind.annotation.XmlSchema(

xmlns = {
//		@javax.xml.bind.annotation.XmlNs(prefix = "i", namespaceURI = "http://www.w3.org/2001/XMLSchema-instance"),
		@javax.xml.bind.annotation.XmlNs(prefix = "", namespaceURI = "http://schemas.microsoft.com/windowsazure")
//		@javax.xml.bind.annotation.XmlNs(prefix = "ns3", namespaceURI = "http://schemas.microsoft.com/windowsazure"),
//		@javax.xml.bind.annotation.XmlNs(prefix = "ns2", namespaceURI = "http://schemas.microsoft.com/windowsazure"),
//		@javax.xml.bind.annotation.XmlNs(prefix = "ns1", namespaceURI = "http://schemas.microsoft.com/windowsazure") 
}, namespace = "http://schemas.microsoft.com/windowsazure", elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED

)
package com.gigaspaces.azure.model;