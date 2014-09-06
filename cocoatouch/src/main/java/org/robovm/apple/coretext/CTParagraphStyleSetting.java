/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.coretext;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CTParagraphStyleSetting/*</name>*/ 
    extends /*<extends>*/Struct<CTParagraphStyleSetting>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CTParagraphStyleSettingPtr extends Ptr<CTParagraphStyleSetting, CTParagraphStyleSettingPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CTParagraphStyleSetting() {}
    public CTParagraphStyleSetting(CTParagraphStyleSpecifier spec, @MachineSizedUInt long valueSize, VoidPtr value) {
        this.spec(spec);
        this.valueSize(valueSize);
        this.value(value);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native CTParagraphStyleSpecifier spec();
    @StructMember(0) public native CTParagraphStyleSetting spec(CTParagraphStyleSpecifier spec);
    @StructMember(1) public native @MachineSizedUInt long valueSize();
    @StructMember(1) public native CTParagraphStyleSetting valueSize(@MachineSizedUInt long valueSize);
    @StructMember(2) public native VoidPtr value();
    @StructMember(2) public native CTParagraphStyleSetting value(VoidPtr value);
    /*</members>*/
    /*<methods>*//*</methods>*/
}