# ShowAlert

[![CircleCI](https://circleci.com/gh/Dfrank7/ShowAlert/tree/master.svg?style=shield)](https://circleci.com/gh/Dfrank7/ShowAlert/tree/master)

## An android Library that display success and failure dialog.
<img src=https://user-images.githubusercontent.com/19290965/76708030-23fc1d80-66f4-11ea-98ac-a88ad0e85b2e.gif alt="Shutdown in action" width=360 height=640/>

## Using ShowAlert Library in your Android application
Add this in your root build.gradle at the end of repositories
  ```groovy
       	repositories {
      			...
      			maven { url 'https://jitpack.io' }
       		}
  ```

 Add this dependency
 ```groovy
     implementation 'com.github.Dfrank7:ShowAlert:1.0.0'
 ```

 Initialize alert in your activity
   ```java
   var dialog = ShowAlert()
   ```
 Then call success/failure method:
 ```java
  dialog.showSuccessAlert(
                  this,
                  "Success",
                  "Payment Was Successful",
                  object : OnClickListener {
                      override fun setCancelButton(view: View) {

                      }

                      override fun setOkayButton(view: View) {

                      }

                  }
              )
  ```
  * This method takes 4 parameters .
  * activity, Title in String, Message in String and an Onclicklistener.

  ## If this library helps you in anyway, show your love by putting a :star: on this project. Thanks ;