/***** Lobxxx Translate Finished ******/
package org.omg.IOP;


/**
* org/omg/IOP/TAG_JAVA_CODEBASE.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u45/3627/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Thursday, April 30, 2015 12:42:09 PM PDT
*/

public interface TAG_JAVA_CODEBASE
{

  /**
     * Class downloading is supported for stubs, ties, values, and 
     * value helpers. The specification allows transmission of codebase 
     * information on the wire for stubs and ties, and enables usage of 
     * pre-existing ClassLoaders when relevant.  
     * <p>
     * For values and value helpers, the codebase is transmitted after the 
     * value tag.  For stubs and ties, the codebase is transmitted as 
     * the TaggedComponent <code>TAG_JAVA_CODEBASE</code> in the IOR 
     * profile, where the <code>component_data</code> is a CDR encapsulation 
     * of the codebase written as an IDL string. The codebase is a 
     * space-separated list of one or more URLs.
     * <p>
     *  存根,关系,值和值助手支持类下载。该规范允许在存根和绑定的线路上传输代码库信息,并且在相关时允许使用预先存在的ClassLoaders。
     * <p>
     *  对于值和值辅助函数,代码库在值标记之后传输。
     * 对于存根和联系,代码库作为IOR配置文件中的TaggedComponent <code> TAG_JAVA_CODEBASE </code>进行传输,其中<code> component_data </code>
     */
  public static final int value = (int)(25L);
}