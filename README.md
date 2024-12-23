Folder structure of the project was created to build out-of-source-tree.

Top-level project named yocto is located in the home directory and has following structure:

1. sources: containes downloaded from git (master branch) into separate folders:
- poky
- meta-openembedded
- meta-raspberrypi

2. build: to be used by bitbake build. Important folders inside:
- conf/bblayers.conf, conf/local.conf
- tmp/deploy/images/

3. custom: containes created custom layer meta-custom with the following recites folders:
- recipes-example
- recipes-custom/hwlocal
- recipes-custom/hwtarlocal
- recipes-custom/hwtarfetch
- recipes-custom/hwmodule

Custom recipes cover:
- hwlocal: simple hello-world application to be build without make or cmake and installed into /usr/bin on the target
- hwtarlocal: simple hello-world application as local tarball to be build with cmake and installed into /usr/bin on the target
- hwtarfetch: simple hello-world application as github tarball to be build with cmake and installed into /usr/bin on the target
- hwmodule: just empty external Linux kernel module to be build with make and installed in /lib/modules and autoloaded

ToDo:
- create recipe to work with DTS(i)
- fill Linux kernel module with real-life example

