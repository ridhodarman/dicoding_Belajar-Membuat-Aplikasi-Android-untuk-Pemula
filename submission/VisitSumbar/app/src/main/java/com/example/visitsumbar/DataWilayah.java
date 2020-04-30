package com.example.visitsumbar;

import java.util.ArrayList;

public class DataWilayah {
    private static String[] namaWilayah = {
            "Kota Padang",
            "Kab. Padang Pariaman",
            "Kota Pariaman",
            "Kab. Tanah Datar",
            "Kota Padang Panjang",
            "Kab. Agam",
            "Kota Bukittinggi",
            "Kab. Pasaman Barat",
            "Kab. Pasaman",
            "Kab. 50 Kota",
            "Kota Payakumbuh",
            "Kab. Kep. Mentawai",
            "Kab. Pesisir Selatan",
            "Kab. Solok",
            "Kota Solok",
            "Kab. Solok Selatan",
            "Kota Sawahlunto",
            "Kab. Sijunjung",
            "Kab. Dharmasraya"
    };

    private static String[] detailWilayah = {
            "Kota Padang adalah kota terbesar di pantai barat Pulau Sumatra dan ibu kota dari provinsi Sumatra Barat, Indonesia. Kota ini merupakan pintu gerbang barat Indonesia dari Samudra Hindia. Wilayah administratifnya memiliki luas 694,96 km² dengan kondisi geografi berbatasan laut dan dikelilingi perbukitan.",
            "Padang Pariaman memiliki luas wilayah 1.328,79 km² dan mempunyai motto 'Saiyo Sakato'. Pusat pemerintahan Kabupaten Padang Pariaman adalah Parit Malintang. Berdasarkan PP No. 79 Tahun 2008, tanggal 30 Desember 2008 tentang pemindahan ibu kota kabupaten Padang Pariaman dari Kota Pariaman ke Nagari Parit Malintang di kecamatan Enam Lingkung.",
            "Kota Pariaman berjarak sekitar 56 km dari kota Padang atau 25 km dari Bandara Internasional Minangkabau. Kota Pariaman diresmikan sebagai kota otonom oleh Menteri Dalam Negeri pada tanggal 2 Juli 2002 berdasarkan UU No. 12 Tahun 2002 tentang pembentukan kota Pariaman di Provinsi Sumatra Barat. Sebelumnya kota ini berstatus kota administratif dan menjadi bagian dari kabupaten Padang Pariaman.",
            "Kabupaten Tanah Datar mempunyai nama lain Luhak Nan Tuo dan memiliki pusat pemerintahan di Batusangkar. Daerah ini banyak terdapat peninggalan sejarah seperti prasasti atau batu bersurat terutama peninggalan zaman Adityawarman.",
            "Kota Padang Panjang adalah kota dengan luas wilayah terkecil di Sumatra Barat. Kota ini dikenal sebagai Mesir van Andalas (Egypte van Andalas). Wilayah administratif kota ini dikelilingi oleh Kabupaten Tanah Datar.",
            "Kabupaten Agam memiliki nama yang didasari oleh Tambo, di mana sebelumnya beberapa nagari yang berada dalam kawasan kabupaten ini sekarang, dahulunya dikenal juga dengan nama Luhak Agam",
            "Kota Bukittinggi terletak pada rangkaian Pegunungan Bukit Barisan atau sekitar 90 km arah utara dari Kota Padang. Bukittinggi merupakan kota dengan perekonomian terbesar kedua di Provinsi Sumatra Barat. Kota ini pada zaman kolonial Belanda disebut dengan Fort de Kock dan dikenal sebagai kota perjuangan bangsa.",
            "Kabupaten Pasaman Barat memiliki pusat pemerintahan di Simpang Ampek. Potensi terbesar Pasaman Barat terletak pada sektor perkebunan kelapa sawit, jeruk, salak, karet, kopi dan cocoa.",
            "Kabupaten Pasaman memiliki pusat pemerintahan di Lubuk Sikaping. Kata pasaman berasal dari Gunung Pasaman, diambil dari bahasa Minangkabau yang berarti persamaan. Hal ini merujuk kepada masyarakat heterogen yang tinggal di kabupaten ini, sedangkan didalam bahasa Mandailing memiliki terdapat kata pasaman yang memiliki arti yang sama dengan bahasa Minangkabau. Kabupaten ini terkenal dengan produksi kelapa sawit.",
            "Kabupaten 50 Kota terletak di bagian timur wilayah provinsi Sumatra Barat. Disebelah utara kabupaten ini bertabasatan langsung dengan Kampar, Provinsi Riau. Sejarah awal kabupaten ini diawali oleh Datuak Sri Maharajo Nan Banego memimpin 50 orang menuju ke arah Utara, daerah Payakumbuh. Tempat ini kemudian dikenal dengan nama Luhak Lima Puluah yang dalam perkembanganya menjadi Kabupaten 50 Kota.",
            "Kota Payakumbuh terletak di daerah dataran tinggi yang merupakan bagian dari Bukit Barisan. Berada pada hamparan kaki Gunung Sago, bentang alam kota ini memiliki ketinggian yang bervariasi. Payakumbuh termasuk kota penghubung antara kota Padang dengan kota Pekanbaru. Kota ini pernah meraih penghargaan IMP, Kota Sehat Wistara, dan pengharaan lainnya.",
            "Kabupaten Kepulauan Mentawai merupakan kabupaten kepulauan yang terletak memanjang dibagian paling barat pulau Sumatra dan dikelilingi oleh Samudera Hindia. Kepulauan Mentawai merupakan bagian dari serangkaian pulau non-vulkanik dan gugus kepulauan itu merupakan puncak-puncak dari suatu punggung pegunungan bawah laut. Daerah ini memiliki potensi untuk menjadi daerah kawasan wisata.",
            "Kabupaten Pesisir Selatan terletak di pinggir pantai, dengan garis pantai sepanjang 218 kilometer Topografinya terdiri dari dataran, gunung dan perbukitan yang merupakan perpanjangan gugusan Bukit Barisan. Nama Pesisir Selatan berasal dari nama daerah ini pada masa penjajahan Belanda, afdeling zuid beneden landen yang berarti dataran rendah bagian selatan.",
            "Kabupaten Solok awalnya memiliki pusat pelayanan pemerintahan di Kota Solok, kemudian dipindahkan ke Koto Baru, Kecamatan Kubung. Kabupaten ini merupakan salah satu sentra produksi beras terbesar di Sumatra Barat, yang dikenal dengan nama Bareh Solok.",
            "Kota Solok merupakan titik persimpangan untuk menuju Kota Padang sebagai ibu kota Provinsi Sumatra Barat yang jaraknya hanya sekitar 64 Km. Bila ke arah utara akan menuju Kota Bukittinggi yang berjarak sekitar 71 Km. Lokasi kota Solok sangat strategis, karena terletak pada persimpangan jalan antar provinsi dan antar kabupaten/kota. Wilayah administrasi Kota Solok berbatasan dengan Kabupaten Solok.",
            "Kabupaten Solok Selatan berada pada dataran tinggi yang relatif bergelombang mulai dari Lubuk Malako di Kecamatan Sangir Jujuan ke arah utara sampai ke wilayah Kecamatan Sangir Batanghari. 69,19% dari wilayah Solok Selatan memiliki kemiringan di atas 40 derajat yang tergolong sangat curam dan rawan terhadap bahaya longsor dan hanya sekitar 15,02 yang tergolong datar dan landai. Kabupaten ini juga terkenal dengan kawasan seribu rumah gadang.",
            "Kota Sawahlunto berkembang menjadi kota wisata tua yang multi etnik, sehingga menjadi salah satu kota tua terbaik di Indonesia. Sebagian wilayah telah ditetapkan sebagai cagar budaya oleh pemerintah setempat dan mencanangkan Sawahlunto menjadi Kota Wisata Tambang yang Berbudaya.",
            "Kabupaten Sijunjung merupakan rangkaian Bukit Barisan yang memanjang dari arah barat laut ke tenggara, sehingga kabupaten ini memiliki ketinggian yang sangat bervariasi, yaitu antara 120 meter sampai 930 meter di atas permukaan laut.",
            "Kabupaten Dharmasraya berada di ujung tenggara Provinsi Sumatra Barat dan berbatasan dengan Provinsi Jambi. Nama kabupaten ini diambil dari manuskrip yang terdapat pada prasasti Padang Roco, di mana pada prasasti itu disebutkan Dharmasraya sebagai ibu kota dari kerajaan Melayu pada masa itu. Kerajaan itu muncul setelah kejatuhan kerajaan Sriwijaya pada abad 13-14."
    };

    private static String[] lokasiWilayah = {
            "Masjid Raya Sumatera Barat, Jl. Khatib Sulaiman, Kec. Padang Utara",
            "Pantai Tiram, Kec. Ulakan Tapakis",
            "Rawa Mati, Pantai Nareh Manggung, Kec. Pariaman Utara",
            "Istano Basa Pagaruyung, Kec. Tanjung Emas",
            "Pusat Dokumentasi dan Informasi Kebudayaan Minangkabau, Perkampungan Minangkabau Silaing Bawah, Kec. Padang Panjang Barat",
            "Ngarai Sianok, Kec. IV Koto",
            "Jam Gadang, Jl. Raya Bukittinggi - Payakumbuh, Benteng Ps. Atas, Kec. Guguk Panjang",
            "Gunung Talamau, Desa Pinagar, Kec. Kinali",
            "Puncak Tonang, Nagari Sundata, Kec. Lubuk Sikaping",
            "Kelok 9, Jorong Ulu Air, Nagari Harau, Kec. Harau",
            "Perkampungan Tradisional Minangkabau Balai Kaliki Koto Nan Godang, Payakumbuh Utara",
            "Pulau Siberut, Mentawai",
            "Kawasan Mandeh,  Kecamatan Koto XI Tarusan",
            "Kebun Teh, Nagari Alahan Panjang, Kec. Lembah Gumanti",
            "Rumah Pohon Laing, Kec. Tanjuang Harapan",
            "Kawasan PT Supreme Energy Muara Laboh",
            "Kawasan Tambang Batubara Ombilin, Kecamatan Barangin",
            "Kantor Bupati Sijunjung, Muaro Sijunjung, Kecamatan Sijunjung",
            "Jembatan Kabel Sungai Dareh, Kec. Pulau Punjung"
    };

    private static int[] fotoWilayah = {
            R.drawable.padang,
            R.drawable.padang_pariaman,
            R.drawable.pariaman,
            R.drawable.tanah_datar,
            R.drawable.padang_panjang,
            R.drawable.agam,
            R.drawable.bukittinggi,
            R.drawable.pasaman_barat,
            R.drawable.pasaman,
            R.drawable.kota50,
            R.drawable.payakumbuh,
            R.drawable.mentawai,
            R.drawable.pesisir_selatan,
            R.drawable.kab_solok,
            R.drawable.solok,
            R.drawable.solok_selatan,
            R.drawable.sawahlunto,
            R.drawable.sijunjung,
            R.drawable.dharmasraya
    };

    static ArrayList<Wilayah> getListData() {
        ArrayList<Wilayah> list = new ArrayList<>();
        for (int position = 0; position < namaWilayah.length; position++) {
            Wilayah wilayah = new Wilayah();
            wilayah.setNama_wilayah(namaWilayah[position]);
            wilayah.setDetail_wilayah(detailWilayah[position]);
            wilayah.setPhoto(fotoWilayah[position]);
            wilayah.setLokasi(lokasiWilayah[position]);
            list.add(wilayah);
        }
        return list;
    }
}