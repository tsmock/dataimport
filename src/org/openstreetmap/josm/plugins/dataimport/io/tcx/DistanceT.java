//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2008.08.10 at 10:24:05 AM CEST
//


package org.openstreetmap.josm.plugins.dataimport.io.tcx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Distance_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Distance_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Duration_t">
 *       &lt;sequence>
 *         &lt;element name="Meters" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Distance_t", propOrder = {
    "meters"
})
public class DistanceT
    extends DurationT
{

    @XmlElement(name = "Meters")
    @XmlSchemaType(name = "unsignedShort")
    protected int meters;

    /**
     * Gets the value of the meters property.
     *
     */
    public int getMeters() {
        return meters;
    }

    /**
     * Sets the value of the meters property.
     *
     */
    public void setMeters(int value) {
        this.meters = value;
    }

}
