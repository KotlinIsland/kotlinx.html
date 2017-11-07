package kotlinx.html

import kotlinx.html.*
import kotlinx.html.impl.*
import kotlinx.html.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

interface FlowContent : FlowOrHeadingContent, FlowOrMetaDataContent, FlowOrInteractiveContent, FlowOrPhrasingContent, FlowOrPhrasingOrMetaDataContent, SectioningOrFlowContent, FlowOrInteractiveOrPhrasingContent, Tag {
}

interface HeadingContent : FlowOrHeadingContent, Tag {
}

interface InteractiveContent : FlowOrInteractiveContent, FlowOrInteractiveOrPhrasingContent, Tag {
}

interface MetaDataContent : Tag {
}

interface PhrasingContent : FlowOrPhrasingContent, FlowOrPhrasingOrMetaDataContent, FlowOrInteractiveOrPhrasingContent, Tag {
}

interface SectioningContent : SectioningOrFlowContent, Tag {
}

fun FlowContent.address(classes : String? = null, block : ADDRESS.() -> Unit = {}) : Unit = ADDRESS(attributesMapOf("class", classes), consumer).visit(block)

fun FlowContent.blockQuote(classes : String? = null, block : BLOCKQUOTE.() -> Unit = {}) : Unit = BLOCKQUOTE(attributesMapOf("class", classes), consumer).visit(block)

fun FlowContent.dialog(classes : String? = null, block : DIALOG.() -> Unit = {}) : Unit = DIALOG(attributesMapOf("class", classes), consumer).visit(block)

fun FlowContent.div(classes : String? = null, block : DIV.() -> Unit = {}) : Unit = DIV(attributesMapOf("class", classes), consumer).visit(block)

fun FlowContent.dl(classes : String? = null, block : DL.() -> Unit = {}) : Unit = DL(attributesMapOf("class", classes), consumer).visit(block)

fun FlowContent.fieldSet(classes : String? = null, block : FIELDSET.() -> Unit = {}) : Unit = FIELDSET(attributesMapOf("class", classes), consumer).visit(block)

fun FlowContent.figure(classes : String? = null, block : FIGURE.() -> Unit = {}) : Unit = FIGURE(attributesMapOf("class", classes), consumer).visit(block)

fun FlowContent.figcaption(classes : String? = null, block : FIGCAPTION.() -> Unit = {}) : Unit = FIGCAPTION(attributesMapOf("class", classes), consumer).visit(block)

fun FlowContent.footer(classes : String? = null, block : FOOTER.() -> Unit = {}) : Unit = FOOTER(attributesMapOf("class", classes), consumer).visit(block)

fun FlowContent.form(action : String? = null, encType : FormEncType? = null, method : FormMethod? = null, classes : String? = null, block : FORM.() -> Unit = {}) : Unit = FORM(attributesMapOf("action", action,"enctype", encType?.enumEncode(),"method", method?.enumEncode(),"class", classes), consumer).visit(block)
fun FlowContent.getForm(action : String? = null, encType : FormEncType? = null, classes : String? = null, block : FORM.() -> Unit = {}) : Unit = FORM(attributesMapOf("action", action,"enctype", encType?.enumEncode(),"method", FormMethod.get.realValue,"class", classes), consumer).visit(block)
fun FlowContent.postForm(action : String? = null, encType : FormEncType? = null, classes : String? = null, block : FORM.() -> Unit = {}) : Unit = FORM(attributesMapOf("action", action,"enctype", encType?.enumEncode(),"method", FormMethod.post.realValue,"class", classes), consumer).visit(block)
fun FlowContent.putForm(action : String? = null, encType : FormEncType? = null, classes : String? = null, block : FORM.() -> Unit = {}) : Unit = FORM(attributesMapOf("action", action,"enctype", encType?.enumEncode(),"method", FormMethod.put.realValue,"class", classes), consumer).visit(block)
fun FlowContent.deleteForm(action : String? = null, encType : FormEncType? = null, classes : String? = null, block : FORM.() -> Unit = {}) : Unit = FORM(attributesMapOf("action", action,"enctype", encType?.enumEncode(),"method", FormMethod.delete.realValue,"class", classes), consumer).visit(block)
fun FlowContent.patchForm(action : String? = null, encType : FormEncType? = null, classes : String? = null, block : FORM.() -> Unit = {}) : Unit = FORM(attributesMapOf("action", action,"enctype", encType?.enumEncode(),"method", FormMethod.patch.realValue,"class", classes), consumer).visit(block)

fun FlowContent.header(classes : String? = null, block : HEADER.() -> Unit = {}) : Unit = HEADER(attributesMapOf("class", classes), consumer).visit(block)

fun FlowContent.hr(classes : String? = null, block : HR.() -> Unit = {}) : Unit = HR(attributesMapOf("class", classes), consumer).visit(block)

fun FlowContent.ol(classes : String? = null, block : OL.() -> Unit = {}) : Unit = OL(attributesMapOf("class", classes), consumer).visit(block)

fun FlowContent.p(classes : String? = null, block : P.() -> Unit = {}) : Unit = P(attributesMapOf("class", classes), consumer).visit(block)

fun FlowContent.pre(classes : String? = null, block : PRE.() -> Unit = {}) : Unit = PRE(attributesMapOf("class", classes), consumer).visit(block)

fun FlowContent.table(classes : String? = null, block : TABLE.() -> Unit = {}) : Unit = TABLE(attributesMapOf("class", classes), consumer).visit(block)

fun FlowContent.ul(classes : String? = null, block : UL.() -> Unit = {}) : Unit = UL(attributesMapOf("class", classes), consumer).visit(block)

fun MetaDataContent.base(classes : String? = null, block : BASE.() -> Unit = {}) : Unit = BASE(attributesMapOf("class", classes), consumer).visit(block)

fun MetaDataContent.command(type : CommandType? = null, classes : String? = null, block : COMMAND.() -> Unit = {}) : Unit = COMMAND(attributesMapOf("type", type?.enumEncode(),"class", classes), consumer).visit(block)
fun MetaDataContent.commandCommand(classes : String? = null, block : COMMAND.() -> Unit = {}) : Unit = COMMAND(attributesMapOf("type", CommandType.command.realValue,"class", classes), consumer).visit(block)
fun MetaDataContent.checkBoxCommand(classes : String? = null, block : COMMAND.() -> Unit = {}) : Unit = COMMAND(attributesMapOf("type", CommandType.checkBox.realValue,"class", classes), consumer).visit(block)
fun MetaDataContent.radioCommand(classes : String? = null, block : COMMAND.() -> Unit = {}) : Unit = COMMAND(attributesMapOf("type", CommandType.radio.realValue,"class", classes), consumer).visit(block)

fun MetaDataContent.link(href : String? = null, rel : String? = null, type : String? = null, block : LINK.() -> Unit = {}) : Unit = LINK(attributesMapOf("href", href,"rel", rel,"type", type), consumer).visit(block)

fun MetaDataContent.meta(name : String? = null, content : String? = null, charset : String? = null, block : META.() -> Unit = {}) : Unit = META(attributesMapOf("name", name,"content", content,"charset", charset), consumer).visit(block)

fun MetaDataContent.noScript(classes : String? = null, block : NOSCRIPT.() -> Unit = {}) : Unit = NOSCRIPT(attributesMapOf("class", classes), consumer).visit(block)

fun MetaDataContent.script(type : String? = null, src : String? = null, block : SCRIPT.() -> Unit = {}) : Unit = SCRIPT(attributesMapOf("type", type,"src", src), consumer).visit(block)
@Deprecated("This tag doesn't support content or requires unsafe (try unsafe {})")
@Suppress("DEPRECATION")
fun MetaDataContent.script(type : String? = null, src : String? = null, content : String = "") : Unit = SCRIPT(attributesMapOf("type", type,"src", src), consumer).visit({+content})

fun MetaDataContent.style(type : String? = null, block : STYLE.() -> Unit = {}) : Unit = STYLE(attributesMapOf("type", type), consumer).visit(block)
@Deprecated("This tag doesn't support content or requires unsafe (try unsafe {})")
@Suppress("DEPRECATION")
fun MetaDataContent.style(type : String? = null, content : String = "") : Unit = STYLE(attributesMapOf("type", type), consumer).visit({+content})

fun MetaDataContent.title(block : TITLE.() -> Unit = {}) : Unit = TITLE(emptyMap, consumer).visit(block)
fun MetaDataContent.title(content : String = "") : Unit = TITLE(emptyMap, consumer).visit({+content})

