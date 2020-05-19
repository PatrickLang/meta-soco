
SUMMARY = "HTTP library with thread-safe connection pooling, file post, and more."
HOMEPAGE = "https://urllib3.readthedocs.io/"
AUTHOR = "Andrey Petrov <andrey.petrov@shazow.net>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=65715c2eb961313d71b297dd5a04f85e"

SRC_URI = "https://files.pythonhosted.org/packages/05/8c/40cd6949373e23081b3ea20d5594ae523e681b6f472e600fbc95ed046a36/urllib3-1.25.9.tar.gz"
SRC_URI[md5sum] = "dbf9b868b90880b24b1ac278094e912e"
SRC_URI[sha256sum] = "3018294ebefce6572a474f0604c2021e33b3fd8006ecd11d62107a5d2a963527"

S = "${WORKDIR}/urllib3-1.25.9"

RDEPENDS_${PN} = ""

inherit setuptools3
