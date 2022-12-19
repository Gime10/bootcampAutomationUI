echo "Running Container: WEB Automation "
gradle --version
java --version
echo "Executing TICKTICK WEB Automation Test"
cd /tmp/WebSelenium/
echo "gradle clean test --tests CRUDTask"
gradle clean test --tests CRUDTask
echo "TEST COMPLETED"

