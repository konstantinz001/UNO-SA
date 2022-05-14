var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "40064",
        "ok": "9515",
        "ko": "30549"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "25"
    },
    "maxResponseTime": {
        "total": "57807",
        "ok": "57807",
        "ko": "52147"
    },
    "meanResponseTime": {
        "total": "6274",
        "ok": "2461",
        "ko": "7462"
    },
    "standardDeviation": {
        "total": "8065",
        "ok": "7592",
        "ko": "7837"
    },
    "percentiles1": {
        "total": "3246",
        "ok": "29",
        "ko": "4060"
    },
    "percentiles2": {
        "total": "7518",
        "ok": "706",
        "ko": "8760"
    },
    "percentiles3": {
        "total": "25788",
        "ok": "19498",
        "ko": "25939"
    },
    "percentiles4": {
        "total": "36991",
        "ok": "38695",
        "ko": "36363"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 7261,
    "percentage": 18
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 272,
    "percentage": 1
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 1982,
    "percentage": 5
},
    "group4": {
    "name": "failed",
    "count": 30549,
    "percentage": 76
},
    "meanNumberOfRequestsPerSecond": {
        "total": "89.429",
        "ok": "21.239",
        "ko": "68.19"
    }
},
contents: {
"req_load-ec4d1": {
        type: "REQUEST",
        name: "load",
path: "load",
pathFormatted: "req_load-ec4d1",
stats: {
    "name": "load",
    "numberOfRequests": {
        "total": "20032",
        "ok": "3376",
        "ko": "16656"
    },
    "minResponseTime": {
        "total": "24",
        "ok": "24",
        "ko": "25"
    },
    "maxResponseTime": {
        "total": "57807",
        "ok": "57807",
        "ko": "52147"
    },
    "meanResponseTime": {
        "total": "6100",
        "ok": "3966",
        "ko": "6532"
    },
    "standardDeviation": {
        "total": "7678",
        "ok": "10324",
        "ko": "6941"
    },
    "percentiles1": {
        "total": "3147",
        "ok": "33",
        "ko": "3589"
    },
    "percentiles2": {
        "total": "7619",
        "ok": "909",
        "ko": "8631"
    },
    "percentiles3": {
        "total": "22593",
        "ok": "33493",
        "ko": "21287"
    },
    "percentiles4": {
        "total": "36839",
        "ok": "43766",
        "ko": "34976"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 2519,
    "percentage": 13
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 61,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 796,
    "percentage": 4
},
    "group4": {
    "name": "failed",
    "count": 16656,
    "percentage": 83
},
    "meanNumberOfRequestsPerSecond": {
        "total": "44.714",
        "ok": "7.536",
        "ko": "37.179"
    }
}
    },"req_save-43781": {
        type: "REQUEST",
        name: "save",
path: "save",
pathFormatted: "req_save-43781",
stats: {
    "name": "save",
    "numberOfRequests": {
        "total": "20032",
        "ok": "6139",
        "ko": "13893"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "2014"
    },
    "maxResponseTime": {
        "total": "53707",
        "ok": "53707",
        "ko": "42653"
    },
    "meanResponseTime": {
        "total": "6449",
        "ok": "1634",
        "ko": "8577"
    },
    "standardDeviation": {
        "total": "8432",
        "ok": "5365",
        "ko": "8661"
    },
    "percentiles1": {
        "total": "3383",
        "ok": "4",
        "ko": "5187"
    },
    "percentiles2": {
        "total": "7535",
        "ok": "637",
        "ko": "9266"
    },
    "percentiles3": {
        "total": "27931",
        "ok": "11342",
        "ko": "29836"
    },
    "percentiles4": {
        "total": "37562",
        "ok": "30445",
        "ko": "37731"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 4742,
    "percentage": 24
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 211,
    "percentage": 1
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 1186,
    "percentage": 6
},
    "group4": {
    "name": "failed",
    "count": 13893,
    "percentage": 69
},
    "meanNumberOfRequestsPerSecond": {
        "total": "44.714",
        "ok": "13.703",
        "ko": "31.011"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
