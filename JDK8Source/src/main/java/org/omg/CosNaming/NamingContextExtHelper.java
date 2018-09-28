/***** Lobxxx Translate Finished ******/
package org.omg.CosNaming;


/**
* org/omg/CosNaming/NamingContextExtHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u45/3627/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Thursday, April 30, 2015 12:42:08 PM PDT
*/


/** 
 * <code>NamingContextExt</code> is the extension of <code>NamingContext</code>
 * which
 * contains a set of name bindings in which each name is unique and is
 * part of Interoperable Naming Service.
 * Different names can be bound to an object in the same or different
 * contexts at the same time. Using <tt>NamingContextExt</tt>, you can use
 * URL-based names to bind and resolve. <p>
 * 
 * See <a href="http://www.omg.org/technology/documents/formal/naming_service.htm">
 * CORBA COS 
 * Naming Specification.</a>
 * <p>
 *  <code> NamingContextExt </code>是<code> NamingContext </code>的扩展,它包含一组名称绑定,其中每个名称是唯一的,并且是可互操作命名服务的一部分
 * 。
 * 不同的名称可以同时绑定到相同或不同上下文中的对象。使用<tt> NamingContextExt </tt>,您可以使用基于URL的名称进行绑定和解析。 <p>。
 */
abstract public class NamingContextExtHelper
{
  private static String  _id = "IDL:omg.org/CosNaming/NamingContextExt:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.CosNaming.NamingContextExt that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.CosNaming.NamingContextExt extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (org.omg.CosNaming.NamingContextExtHelper.id (), "NamingContextExt");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.CosNaming.NamingContextExt read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_NamingContextExtStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.CosNaming.NamingContextExt value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static org.omg.CosNaming.NamingContextExt narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.omg.CosNaming.NamingContextExt)
      return (org.omg.CosNaming.NamingContextExt)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      org.omg.CosNaming._NamingContextExtStub stub = new org.omg.CosNaming._NamingContextExtStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static org.omg.CosNaming.NamingContextExt unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.omg.CosNaming.NamingContextExt)
      return (org.omg.CosNaming.NamingContextExt)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      org.omg.CosNaming._NamingContextExtStub stub = new org.omg.CosNaming._NamingContextExtStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}