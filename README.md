# Custom Capability Matcher

> Adds support of `deviceName` or `appium:deviceName` while still supports default `browserName`.

Still works like default capability matcher, but also adds suport of `deviceName`.

Don't pass device name into `browser` property, it is required to pass either `browser` or `deviceName`.

## Usage

Specify custom capability matcher in hub config json (see example).
```json
{
  "capabilityMatcher": "com.wdio.qa.grid.matcher.CapabilityMatcher",
  "registry": "org.openqa.grid.internal.DefaultGridRegistry"
}
```

Run grid server

```sh
seleniumServerJar=selenium-server-standalone-3.141.59.jar
capabilityMatcherJar=grid-capability-matcher-3.141.59.jar
javaClasses="$seleniumServerJar:$capabilityMatcherJar"

java -cp $javaClasses org.openqa.grid.selenium.GridLauncherV3 -role hub -hubConfig hubconfig.json
```

## Running

1. Build `mvn -q install -DskipTests` 
2. Download grid server `./download-server.sh` (in *run* folder)
3. Run grid server `./gridStart.sh` (in *run* folder)

---

[Original Turtorial](https://rationaleemotions.wordpress.com/2014/01/19/working-with-a-custom-capability-matcher-in-the-grid/)
