
SUMMARY = "Python package for providing Mozilla's CA Bundle."
HOMEPAGE = "https://certifiio.readthedocs.io/en/latest/"
AUTHOR = "Kenneth Reitz <me@kennethreitz.com>"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f77f61d14ee6feac4228d3ebd26cc1f1"

SRC_URI = "https://files.pythonhosted.org/packages/b8/e2/a3a86a67c3fc8249ed305fc7b7d290ebe5e4d46ad45573884761ef4dea7b/certifi-2020.4.5.1.tar.gz"
SRC_URI[md5sum] = "8e90cfd6fc5ddd7e3011958d8a7fcab4"
SRC_URI[sha256sum] = "51fcb31174be6e6664c5f69e3e1691a2d72a1a12e90f872cbdb1567eb47b6519"

S = "${WORKDIR}/certifi-2020.4.5.1"

RDEPENDS_${PN} = ""

inherit setuptools3
