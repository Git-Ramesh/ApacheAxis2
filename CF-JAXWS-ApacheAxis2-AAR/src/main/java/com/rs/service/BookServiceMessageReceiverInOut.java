/**
 * BookServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package com.rs.service;


/**
 *  BookServiceMessageReceiverInOut message receiver
 */
public class BookServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {
    public void invokeBusinessLogic(
        org.apache.axis2.context.MessageContext msgContext,
        org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault {
        try {
            // get the implementation class for the Web Service
            Object obj = getTheImplementationObject(msgContext);

            BookServiceSkeleton skel = (BookServiceSkeleton) obj;

            //Out Envelop
            org.apache.axiom.soap.SOAPEnvelope envelope = null;

            //Find the axisOperation that has been set by the Dispatch phase.
            org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext()
                                                                      .getAxisOperation();

            if (op == null) {
                throw new org.apache.axis2.AxisFault(
                    "Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
            }

            java.lang.String methodName;

            if ((op.getName() != null) &&
                    ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(
                            op.getName().getLocalPart())) != null)) {
                if ("searchBook".equals(methodName)) {
                    com.rs.service.SearchBookOut searchBookOut9 = null;
                    com.rs.service.SearchBookIn wrappedParam = (com.rs.service.SearchBookIn) fromOM(msgContext.getEnvelope()
                                                                                                              .getBody()
                                                                                                              .getFirstElement(),
                            com.rs.service.SearchBookIn.class);

                    searchBookOut9 = skel.searchBook(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            searchBookOut9, false,
                            new javax.xml.namespace.QName(
                                "http://service.rs.com", "SearchBookOut"));
                } else if ("registerBook".equals(methodName)) {
                    com.rs.service.RegisterBookOut registerBookOut11 = null;
                    com.rs.service.RegisterBookIn wrappedParam = (com.rs.service.RegisterBookIn) fromOM(msgContext.getEnvelope()
                                                                                                                  .getBody()
                                                                                                                  .getFirstElement(),
                            com.rs.service.RegisterBookIn.class);

                    registerBookOut11 = skel.registerBook(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            registerBookOut11, false,
                            new javax.xml.namespace.QName(
                                "http://service.rs.com", "RegisterBookOut"));
                } else {
                    throw new java.lang.RuntimeException("method not found");
                }

                newMsgContext.setEnvelope(envelope);
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    //
    private org.apache.axiom.om.OMElement toOM(
        com.rs.service.SearchBookIn param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.rs.service.SearchBookIn.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.rs.service.SearchBookOut param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.rs.service.SearchBookOut.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.rs.service.RegisterBookIn param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.rs.service.RegisterBookIn.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.rs.service.RegisterBookOut param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.rs.service.RegisterBookOut.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.rs.service.SearchBookOut param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    com.rs.service.SearchBookOut.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.rs.service.SearchBookOut wrapsearchBook() {
        com.rs.service.SearchBookOut wrappedElement = new com.rs.service.SearchBookOut();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.rs.service.RegisterBookOut param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    com.rs.service.RegisterBookOut.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.rs.service.RegisterBookOut wrapregisterBook() {
        com.rs.service.RegisterBookOut wrappedElement = new com.rs.service.RegisterBookOut();

        return wrappedElement;
    }

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
        java.lang.Class type) throws org.apache.axis2.AxisFault {
        try {
            if (com.rs.service.RegisterBookIn.class.equals(type)) {
                return com.rs.service.RegisterBookIn.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.rs.service.RegisterBookOut.class.equals(type)) {
                return com.rs.service.RegisterBookOut.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.rs.service.SearchBookIn.class.equals(type)) {
                return com.rs.service.SearchBookIn.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.rs.service.SearchBookOut.class.equals(type)) {
                return com.rs.service.SearchBookOut.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }

    private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();

        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }
} //end of class
