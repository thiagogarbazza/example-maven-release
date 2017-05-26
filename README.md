# test-maven-release



mvn -B release:update-versions -DdevelopmentVersion=99.99.99-SNAPSHOT

mvn -B release:clean release:prepare -Dusername=USER -Dpassword=PASS -DignoreSnapshots=true -DdevelopmentVersion=0.3.0-SNAPSHOT