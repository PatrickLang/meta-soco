# Building a Raspberry Pi image with SoCo

> If you haven't built with Yocto before, it's worth reading the [Yocto Project Quick Build](https://www.yoctoproject.org/docs/3.1/brief-yoctoprojectqs/brief-yoctoprojectqs.html) guide



Make a working directory for the Yocto stuff

```
mkdir yocto-test
cd yocto-test
```

Clone the Poky reference distribution

```
git clone -b dunfell git://git.yoctoproject.org/poky
```


Clone the extra meta-layers, including this one

```
cd poky
git clone -b dunfell git://git.yoctoproject.org/meta-raspberrypi
git clone -b dunfell git://git.openembedded.org/meta-openembedded
git clone git@github.com:PatrickLang/meta-soco.git
```

Now, create a build configuration folder using the template included here

```
TEMPLATECONF=meta-soco/conf . oe-init-build-env ../build
```

or the RaspberryPi which includes
   meta-rpi/conf/
   meta-rpi/conf/local.conf.sample
   meta-rpi/conf/bblayers.conf.sample
   meta-rpi/conf/layer.conf

Then to configure a build using my example config, run

TEMPLATECONF=meta-soco/conf . /oe-init-build-env ../build

Once that's done, you can modify `../build/conf/local.conf` to add/remove packages and other customizations as needed. That included config:

1. Enables serial debugging (UART) at 115200,8,n,1
2. Sets a constant GPU speed, which is needed for stable UART usage with Raspberry Pi Zero & 3 models
3. Includes I2C configuration and tools
4. Includes Python 3, and modules:
  - RPi.GPIO
  - SoCo
