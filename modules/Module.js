//Type your code here
var tempPathFromResourcePath;
function onselectioncallback(rawbytes) {
  var pathArray = kony.string.split(rawbytes.getResourcePath()[0],"/");
  var i=0;
  var basePath = '';
  for (i = 0; i < pathArray.length-1; i++) {
    var str = pathArray[i];
    if(str !== null && str !== ''){
      basePath = basePath+'/'+str;
    }
  }
  tempPathFromResourcePath = basePath;
  //    alert(tempPathFromResourcePath);
  Form1.Image0hd2a9be80e8747.rawBytes = rawbytes;
}

function openMediaGallery() {
  try {
    var querycontext = {
      mimetype: "image/*"
    };
    returnStatus = kony.phone.openMediaGallery(onselectioncallback, querycontext);
  } catch (err) {
    alert("error in openMediaGallery:: " + err);
  }
}

function validateTempPath() {
  var tempPath = kony.types.RawBytes.getTempPath();
  if(tempPath == tempPathFromResourcePath){
    alert('Success');
  }else{
    alert('Failure');
  }
}

function clearRawBytesData() {
  var tempPath = kony.types.RawBytes.getTempPath();
  var filesList = new kony.io.File(tempPath).getFilesList();
  //         alert(filesList.length);
  Form1.FilesInTempPath.text += filesList.length;
  kony.print(filesList);
  var i;
  for (i = 0; i < filesList.length; i++) {
    var myFile = new kony.io.File(filesList.item(i)["fullPath"]);
    myFile.remove();
  }
  filesList = new kony.io.File(tempPath).getFilesList();
  Form1.FilesInTempPathAfterRemoving.text += filesList.length;
  //         alert(filesList.length);
}
