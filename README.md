# Custom Capability Matcher
Example that shows how to implement a Selenium Grid capability matcher, implementation of a tutorial that can be
found [here](https://rationaleemotions.wordpress.com/2014/01/19/working-with-a-custom-capability-matcher-in-the-grid/).

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

## Example

1. Build `mvn -q install -DskipTests` 
2. Download grid server `./download-server.sh` (in *example* folder)
3. Run grid server `./gridStart.sh` (in *example* folder)
