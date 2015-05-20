Seti_JetBrains
==============

[Seti_UI](https://github.com/ctf0/Seti_ST3) and [Seti_UX](https://github.com/ctf0/Seti_UX) port for JetBrains IDE.  
And Hacking `Darcula` Theme.

----

# for starganizer
I prefer the discussion.  
JetBrains is a good product, but it is occlusive to the theme.  
Let's easy to use the JetBrains everyone.  
[Issue](https://github.com/zchee/Seti_JetBrains/issues)

# TOC

[Screenshot](#screenshot) | [Environment](#environment) | [Installation](#installation) | [Status](#status) | [CONTRIBUTE](#contribute) | [Credits](#credits)
---------- | ----------- | ------------ | --------------- | ---------- | -------

----

# Screenshot
Tentatively

![](https://raw.githubusercontent.com/zchee/Seti_JetBrains/master/screenshot/all.png)


----

# Environment
## Platform
- Mac
- Windows (Not maintenance. Please post issue if you want the latest version.)

## Application
- IntelliJ Idea 141.1010.3 ( 14.1.3 )
- IntelliJ Idea EAP 141.1192.2
- RubyMine 141.1119 ( 7.1.2 )
- PhpStorm EAP 141.891
- WebStorm 141.728 ( 10.0.2 )
- WebStorm EAP 141.614
- Android Studio 135.1740770
- AppCode 139.1401.37 (3.1.6)

----

# Important
You must replace this files or move original files in another folder, in other way ide will use renamed files in lib folders.

----

# Installation

## Syntax
Move [Seti_JB.icls](syntax/Seti_JB.icls) to

Platform | Folder path
-------- | -----------
Mac | `~/Library/Preferences/IntelliJIdea14/colors` or `~/Library/Preferences/WebIde80/colors`
Windows | `~\JetBrains\.IntelliJIdea14\config\colors` or `~\.WebIde80\config\colors`


## Theme

### IntelliJ Idea
> ----
> 1. Select your platform `idea.jar` in [idea](https://github.com/zchee/Seti_JetBrains/tree/master/theme/idea).
>
> 2. Replace `idea.jar` to
> 
> Platform | Folder path
> -------- | -----------
> Mac | `/Applications/IntelliJ Idea 14.app/Contents/lib/`
> Windows | `C:\Program Files (x86)\JetBrains\IntelliJ IDEA xxx\lib\`
> ----

### PhpStorm
> ----
> 1. Select your platform `phpstorm.jar` in [phpstorm](https://github.com/zchee/Seti_JetBrains/tree/master/theme/phpstorm).
>
> 2. Replace `phpstorm.jar` to
> 
> Platform | Folder path
> -------- | -----------
> Mac | `/Applications/PhpStorm.app/Contents/lib/`
> Windows | `C:\Program Files (x86)\JetBrains\PhpStorm xxx\lib\`
> ----

### WebStorm
> ----
> 1. Select your platform `webstorm.jar` in [webstorm](https://github.com/zchee/Seti_JetBrains/tree/master/theme/webstorm).
>
> 2. Replace `webstorm.jar` to
> 
> Platform | Folder path
> -------- | -----------
> Mac | `/Applications/WebStorm 10 EAP.app/Contents/lib/`
> Windows | `C:\Program Files (x86)\JetBrains\WebStorm 10 EAP\lib\`
> ----

### RubyMine
> ----
> 1. Select your platform `rubymine.jar` in [rubymine](https://github.com/zchee/Seti_JetBrains/tree/master/theme/rubymine).
>
> 2. Replace `rubymine.jar` to
> 
> Platform | Folder path
> -------- | -----------
> Mac | `/Applications/RubyMine.app/Contents/lib/`
> Windows | `C:\Program Files (x86)\JetBrains\RubyMine\lib\`
> ----

## Icons
1. Open JetBrains IDE.

2. Open Preferences.

3. `Plugins > Install plugin from disk` click.

4. Choose [Seti_JB-icons.jar](icons/Seti_JB-icons.jar)

5. Please Restart IDE.

## Third party plugins icons
Replace to

### IntelliJ Idea
Platform | Folder path
-------- | -----------
Mac | `/Applications/IntelliJ Idea 14.app/Contents/plugins`
Windows | `C:\Program Files (x86)\JetBrains\IntelliJ IDEA xxx\plugins`

### PhpStorm
Platform | Folder path
-------- | -----------
Mac | `/Applications/PhpStorm.app/Contents/plugins`
Windows | `C:\Program Files (x86)\JetBrains\PhpStorm xxx\plugins`

in [plugins](https://github.com/zchee/Seti_JetBrains/tree/master/plugins)


# Status
See [STATUS.md](STATUS.md)


# CONTRIBUTE
See [CONTRIBUTING.md](https://github.com/zchee/Seti_JetBrains/blob/master/CONTRIBUTING.md)


# Credits

- Theme is Originally by [jesseweed](https://github.com/jesseweed/seti-ui).
- Ported based on [Seti_ST3](https://github.com/ctf0/Seti_ST3) by [ctf0](https://github.com/ctf0/).
