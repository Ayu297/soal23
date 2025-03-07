import { useState, useEffect } from "react";
import { fetchNegara, fetchProvinsiByNegara, fetchKotaByProvinsi } from "../services/api";

const CascadingDropdown = () => {
  const [negara, setNegara] = useState([]);
  const [provinsi, setProvinsi] = useState([]);
  const [kota, setKota] = useState([]);

  const [selectedNegara, setSelectedNegara] = useState("");
  const [selectedProvinsi, setSelectedProvinsi] = useState("");

  useEffect(() => {
    fetchNegara().then((res) => setNegara(res.data));
  }, []);

  useEffect(() => {
    if (selectedNegara) {
      fetchProvinsiByNegara(selectedNegara).then((res) => setProvinsi(res.data));
      setKota([]);
    }
  }, [selectedNegara]);

  useEffect(() => {
    if (selectedProvinsi) {
      fetchKotaByProvinsi(selectedProvinsi).then((res) => setKota(res.data));
    }
  }, [selectedProvinsi]);

  return (
    <div style={styles.container}>
      <h2 style={styles.title}>Pilih Lokasi Anda</h2>

      {/* Dropdown Negara */}
      <select style={styles.select} value={selectedNegara} onChange={(e) => setSelectedNegara(e.target.value)}>
        <option value="">Pilih Negara</option>
        {negara.map((item) => (
          <option key={item.id} value={item.id}>
            {item.nama}
          </option>
        ))}
      </select>

      {/* Dropdown Provinsi */}
      <select style={styles.select} value={selectedProvinsi} onChange={(e) => setSelectedProvinsi(e.target.value)} disabled={!selectedNegara}>
        <option value="">Pilih Provinsi</option>
        {provinsi.map((item) => (
          <option key={item.id} value={item.id}>
            {item.nama}
          </option>
        ))}
      </select>

      {/* Dropdown Kota */}
      <select style={styles.select} disabled={!selectedProvinsi}>
        <option value="">Pilih Kota</option>
        {kota.map((item) => (
          <option key={item.id} value={item.id}>
            {item.nama}
          </option>
        ))}
      </select>
    </div>
  );
};

// Styling untuk pusatkan form dan dropdown
const styles = {
  container: {
    display: "flex",
    flexDirection: "column",
    alignItems: "center",
    justifyContent: "center",
    height: "100vh",
    gap: "10px",
  },
  title: {
    fontSize: "24px",
    fontWeight: "bold",
    marginBottom: "10px",
  },
  select: {
    width: "250px",
    padding: "8px",
    fontSize: "16px",
    borderRadius: "5px",
    border: "1px solid #ccc",
  },
};

export default CascadingDropdown;
