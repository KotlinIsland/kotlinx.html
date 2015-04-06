package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public class UL(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("ul", consumer, initialAttributes) {
    var onAbort : String by attributeStringOnAbort
    var contentEditable : Boolean by attributeBooleanContentEditable
    var onLoadedMetaData : String by attributeStringOnLoadedMetaData
    var onScroll : String by attributeStringOnScroll
    var onSeeking : String by attributeStringOnSeeking
    var id : String by attributeString
    var onLoad : String by attributeStringOnLoad
    var onDragStart : String by attributeStringOnDragStart
    var onInput : String by attributeStringOnInput
    var onTimeUpdate : String by attributeStringOnTimeUpdate
    var onShow : String by attributeStringOnShow
    var onClick : String by attributeStringOnClick
    var onFocus : String by attributeStringOnFocus
    var contextMenu : String by attributeStringContextMenu
    var onStalled : String by attributeStringOnStalled
    var onProgress : String by attributeStringOnProgress
    var draggable : Draggable by attributeDraggableDraggableDraggableValues
    var item : String by attributeString
    var onVolumeChange : String by attributeStringOnVolumeChange
    var subject : String by attributeString
    var onCanPlay : String by attributeStringOnCanPlay
    var onContextMenu : String by attributeStringOnContextMenu
    var classes : String by attributeStringClass
    var runAt : RunAt by attributeRunAtRunAtRunAtValues
    var onError : String by attributeStringOnError
    var onFormChange : String by attributeStringOnFormChange
    var onSeeked : String by attributeStringOnSeeked
    var onLoadedData : String by attributeStringOnLoadedData
    var onDurationChange : String by attributeStringOnDurationChange
    var onMouseOver : String by attributeStringOnMouseOver
    var onMouseWheel : String by attributeStringOnMouseWheel
    var onDrag : String by attributeStringOnDrag
    var onDragLeave : String by attributeStringOnDragLeave
    var onPlaying : String by attributeStringOnPlaying
    var onFormInput : String by attributeStringOnFormInput
    var onKeyUp : String by attributeStringOnKeyUp
    var onRateChange : String by attributeStringOnRateChange
    var onKeyDown : String by attributeStringOnKeyDown
    var onMouseDown : String by attributeStringOnMouseDown
    var onChange : String by attributeStringOnChange
    var onKeyPress : String by attributeStringOnKeyPress
    var itemProp : String by attributeStringItemProp
    var onDoubleClick : String by attributeStringOnDoubleClick
    var onReadyStateChange : String by attributeStringOnReadyStateChange
    var onDragEnter : String by attributeStringOnDragEnter
    var hidden : Boolean by attributeBooleanHiddenHiddenEmpty
    var lang : String by attributeString
    var onWaiting : String by attributeStringOnWaiting
    var accessKey : String by attributeStringAccessKey
    var onPause : String by attributeStringOnPause
    var style : String by attributeString
    var onEmptied : String by attributeStringOnEmptied
    var dir : Dir by attributeDirDirDirValues
    var onSelect : String by attributeStringOnSelect
    var onLoadStart : String by attributeStringOnLoadStart
    var onDragOver : String by attributeStringOnDragOver
    var onSuspend : String by attributeStringOnSuspend
    var tabIndex : String by attributeString
    var onMouseUp : String by attributeStringOnMouseUp
    var role : String by attributeString
    var onMouseMove : String by attributeStringOnMouseMove
    var onMouseOut : String by attributeStringOnMouseOut
    var onPlay : String by attributeStringOnPlay
    var onCanPlayThrough : String by attributeStringOnCanPlayThrough
    var onEnded : String by attributeStringOnEnded
    var onBlur : String by attributeStringOnBlur
    var dataMsgId : String by attributeStringDataMsgId
    var onDrop : String by attributeStringOnDrop
    var spellCheck : Boolean by attributeBooleanSpellCheck
    var onInvalid : String by attributeStringOnInvalid
    var title : String by attributeString
    var dataFolderName : String by attributeStringDataFolderName
    var onSubmit : String by attributeStringOnSubmit

    override
    fun li(block : LI.() -> Unit) : Unit = super.li(block)

}
