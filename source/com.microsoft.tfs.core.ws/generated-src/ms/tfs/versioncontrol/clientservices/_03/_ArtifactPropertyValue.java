// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.versioncontrol.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.versioncontrol.clientservices._03._ArtifactPropertyValue;
import ms.tfs.versioncontrol.clientservices._03._ArtifactSpec;
import ms.tfs.versioncontrol.clientservices._03._PropertyValue;

import java.lang.Object;
import java.lang.String;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _ArtifactPropertyValue
    implements ElementSerializable, ElementDeserializable
{
    // No attributes    

    // Elements
    protected _ArtifactSpec spec;
    protected _PropertyValue[] propertyValues;

    public _ArtifactPropertyValue()
    {
        super();
    }

    public _ArtifactPropertyValue(
        final _ArtifactSpec spec,
        final _PropertyValue[] propertyValues)
    {
        // TODO : Call super() instead of setting all fields directly?
        setSpec(spec);
        setPropertyValues(propertyValues);
    }

    public _ArtifactSpec getSpec()
    {
        return this.spec;
    }

    public void setSpec(_ArtifactSpec value)
    {
        this.spec = value;
    }

    public _PropertyValue[] getPropertyValues()
    {
        return this.propertyValues;
    }

    public void setPropertyValues(_PropertyValue[] value)
    {
        this.propertyValues = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.spec != null)
        {
            this.spec.writeAsElement(
                writer,
                "Spec");
        }

        if (this.propertyValues != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("PropertyValues");

            for (int iterator0 = 0; iterator0 < this.propertyValues.length; iterator0++)
            {
                this.propertyValues[iterator0].writeAsElement(
                    writer,
                    "PropertyValue");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // This object uses no attributes

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("Spec"))
                {
                    this.spec = new _ArtifactSpec();
                    this.spec.readFromElement(reader);
                }
                else if (localName.equalsIgnoreCase("PropertyValues"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            _PropertyValue complexObject0 = new _PropertyValue();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.propertyValues = (_PropertyValue[]) list0.toArray(new _PropertyValue[list0.size()]);
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}