# Seti_JetBrains
[![Circle CI](https://circleci.com/gh/zchee/Seti_JetBrains.svg?style=svg)](https://circleci.com/gh/zchee/Seti_JetBrains)

[Seti_UI](https://github.com/ctf0/Seti_ST3) and [Seti_UX](https://github.com/ctf0/Seti_UX) theme port for JetBrains all IDE.  
and **Hacking** JetBrains addon `Darcula` Theme.

====

#### Special Thanks
[![jetbrains][99.1]][99]  [![jesseweed][98.1]][98] [![ctf0][97.1]][97]

====

#### For starganizer
I'm a...
```
Sorry, I do not have a good at English.
It is naive English, but please acknowledge.
```

but, I prefer the discussion.
JetBrains is a good product, but it is occlusive to the theme.  
Let's easy to use the JetBrains everyone. [Issues page](https://github.com/zchee/Seti_JetBrains/issues).

**I'm awakening at anytime.** Please feel free to question and discuss!  
[![twitter][1.1]][1]  [![github][2.1]][2]  [![google][3.1]][3]

====

----
[Screenshot](#screenshot) | [Screencast](#screencast) | [Environment](#environment) | [Installation](#installation) | [Status](#status) | [CONTRIBUTE](#contribute) | [Credits](#credits) |
---------- | ----------- | ----------- | ------------ | ----------------- | ------------------------- | ------------------- |

----

## Screenshot
Tentatively

![](https://raw.githubusercontent.com/zchee/Seti_JetBrains/master/screenshot/all.png)

## Screencast

[![](https://raw.githubusercontent.com/zchee/Seti_JetBrains/master/screenshot/screencast.png)](https://youtu.be/0uP6jUA7tNA)
https://www.youtube.com/watch?v=0uP6jUA7tNA

## Environment
### Platform
- Mac OS X
- Unix *( Not test. Please working report in [issues](https://github.com/zchee/Seti_JetBrains/issues). )*
- Windows *( Now, not maintenance. Please [issues](https://github.com/zchee/Seti_JetBrains/issues) if you want the latest version. )*

### Applications version
In principle, it supports only the latest Stable or EAP(Early Access Preview) version.

| Application                   | Build       |
|-------------------------------|-------------|
| IntelliJ IDEA 15 EAP          | 142.4465.2  |
| RubyMine 7.1.4                | 141.1835    |
| RubyMine EAP 8                | 142.4245.2  |
| PhpStorm 9.0.2                | 141.2462    |
| PhpStorm 9.5 EAP              | 142.4491    |
| WebStorm 10.0.4               | 141.1550    |
| WebStorm EAP 11               | 142.4148    |
| PyCharm 4.5.4                 | 141.2569    |
| PyCharm EAP 4.5.4             | 141.2569    |
| AppCode EAP 3.2 RC2           | 141.2456.7  |
| Android Studio Canary 1.3.2   | 141.2178183 |
| CLion 1.1.1                   | 141.2614.4  |

If you want other ide or old version, please [issues](https://github.com/zchee/Seti_JetBrains/issues).

====

## Installation

### Important
You must replace this files or move original files in another folder, in other way ide will use renamed files in lib folders.

### Syntax
Move [Seti_JB.icls](syntax/Seti_JB.icls) to

Platform | Folder path
-------- | -----------
Mac | `~/Library/Preferences/IntelliJIDEA14/colors` or `~/Library/Preferences/WebIde80/colors`
Windows | `~\JetBrains\.IntelliJIDEA14\config\colors` or `~\.WebIde80\config\colors`

====

### Theme

> #### Intellij IDEA

1. Select your platform `idea.jar` in [idea](https://github.com/zchee/Seti_JetBrains/tree/master/theme/idea).

2. Replace `idea.jar` to

Platform | Folder path
-------- | -----------
Mac | `/Applications/IntelliJ IDEA 14.app/Contents/lib/`
Windows | `C:\Program Files (x86)\JetBrains\IntelliJ IDEA xxx\lib\`

=====

> #### PhpStorm

 1. Select your platform `phpstorm.jar` in [phpstorm](https://github.com/zchee/Seti_JetBrains/tree/master/theme/phpstorm).

 2. Replace `phpstorm.jar` to

 Platform | Folder path
 -------- | -----------
 Mac | `/Applications/PhpStorm.app/Contents/lib/`
 Windows | `C:\Program Files (x86)\JetBrains\PhpStorm xxx\lib\`

=====

> #### WebStorm

 1. Select your platform `webstorm.jar` in [webstorm](https://github.com/zchee/Seti_JetBrains/tree/master/theme/webstorm).

 2. Replace `webstorm.jar` to

 Platform | Folder path
 -------- | -----------
 Mac | `/Applications/WebStorm 10 EAP.app/Contents/lib/`
 Windows | `C:\Program Files (x86)\JetBrains\WebStorm 10 EAP\lib\`

=====

> #### RubyMine

 1. Select your platform `rubymine.jar` in [rubymine](https://github.com/zchee/Seti_JetBrains/tree/master/theme/rubymine).

 2. Replace `rubymine.jar` to

 Platform | Folder path
 -------- | -----------
 Mac | `/Applications/RubyMine.app/Contents/lib/`
 Windows | `C:\Program Files (x86)\JetBrains\RubyMine\lib\`

=====

### Icons
**Not upload JetBrains Plugin Repository.**
**Please yourself install.**

1. Download [Seti_JB-icons.jar](icons/Seti_JB-icons.jar)

2. Open JetBrains IDE.

3. Open Preferences.

4. `Plugins > Install plugin from disk` click.

5. Choose [Seti_JB-icons.jar](icons/Seti_JB-icons.jar)

6. Please Restart IDE.

====

### Third party plugins icons
***! deprecation !***

Replace to

> #### IntelliJ IDEA

 Platform | Folder path
 -------- | -----------
 Mac | `/Applications/IntelliJ IDEA 14.app/Contents/plugins`
 Windows | `C:\Program Files (x86)\JetBrains\IntelliJ IDEA xxx\plugins`

> #### PhpStorm

Platform | Folder path
-------- | -----------
Mac | `/Applications/PhpStorm.app/Contents/plugins`
Windows | `C:\Program Files (x86)\JetBrains\PhpStorm xxx\plugins`

in [plugins](https://github.com/zchee/Seti_JetBrains/tree/master/plugins)

====

## Status
Current status support languages, See [STATUS.md](STATUS.md)

====

## CONTRIBUTE
See [CONTRIBUTING.md](https://github.com/zchee/Seti_JetBrains/blob/master/CONTRIBUTING.md)

====

## Credits
- Very awesome IDE by [JetBrains](http://jetbrains.com/)
- [Seti-UI](https://github.com/jesseweed/seti-ui) theme for Atom is Originally by [jesseweed](https://github.com/jesseweed/).
- Port based theme on [Seti_ST3](https://github.com/ctf0/Seti_ST3) by [ctf0](https://github.com/ctf0/).


[1]: https://twitter.com/_zchee_
[2]: https://github.com/zchee/Seti_JetBrains/issues
[3]: https://plus.google.com/u/0/103426224020413009137/
[4]: http://tumblr.com
[5]: http://dribbble.com/
[6]: http://www.facebook.com/

[99]: http://jetbrains.com/
[98]: https://github.com/jesseweed/seti-ui
[97]: https://github.com/ctf0

[1.1]: http://s3.zchee.io/images/fontawesome/32/twitter-square.svg
[2.1]: http://s3.zchee.io/images/fontawesome/32/github-square.svg
[3.1]: http://s3.zchee.io/images/fontawesome/32/google-plus-square.svg
[4.1]: http://s3.zchee.io/images/fontawesome/32/
[5.1]: http://s3.zchee.io/images/fontawesome/32/
[6.1]: http://s3.zchee.io/images/fontawesome/32/

[99.1]: http://s3.zchee.io/images/devicon/128/jetbrains/jetbrains-original.svg (JetBrains by konpa/devicon)
[98.1]: https://github.com/jesseweed/seti-syntax/raw/master/_icons/rounded/rounded-128x128.png (by jesseweed)
[97.1]: https://avatars0.githubusercontent.com/u/7388088?v=3&s=128 (by ctf0)
