## Interface Summary
 
ClipboardOwner	
> Defines the interface for classes that will provide data to a clipboard.  

FlavorListener	
> Defines an object which listens for FlavorEvents.

FlavorMap	
> A two-way Map between "natives" (Strings), which correspond to platform-specific data formats, and "flavors" (DataFlavors), which correspond to platform-independent MIME types.

FlavorTable	
> A FlavorMap which relaxes the traditional 1-to-1 restriction of a Map.

Transferable	
> Defines the interface for classes that can be used to provide data for a transfer operation.

## Class Summary

Clipboard	
> A class that implements a mechanism to transfer data using cut/copy/paste operations.

DataFlavor	
> A DataFlavor provides meta information about data.

FlavorEvent	
> FlavorEvent is used to notify interested parties that available DataFlavors have changed in the Clipboard (the event source).

StringSelection	
> A Transferable which implements the capability required to transfer a String.

SystemFlavorMap	
> The SystemFlavorMap is a configurable map between "natives" (Strings), which correspond to platform-specific data formats, and "flavors" (DataFlavors), which correspond to platform-independent MIME types.

## Exception Summary

MimeTypeParseException	
> A class to encapsulate MimeType parsing related exceptions.

UnsupportedFlavorException	
> Signals that the requested data is not supported in this flavor.
